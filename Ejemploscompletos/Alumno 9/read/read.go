package read

import (
	"fmt"
	"strings"
	"bufio"
	"os"

	"libs.altipla.consulting/errors"
)

var reader *bufio.Reader

func init() {
  reader = bufio.NewReader(os.Stdin)
}

func Read(title string) (string, error) {
	fmt.Println(title)

	text, err := reader.ReadString('\n')
	if err != nil {
		return "", errors.Wrapf(err, "error reading from console")
	}
	text = strings.Replace(text, "\r", "", -1)
	text = strings.Replace(text, "\n", "", -1)

	return strings.TrimSpace(text), nil
}
