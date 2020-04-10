func main() {
  // Read tests.
  text, err := read.Read("Enter number of tests (Type: 3).")
  if err != nil {
    log.Fatal(errors.Stack(err))
  }
  tests, err := strconv.Atoi(text)
  if err != nil {
    log.Fatal(errors.Stack(err))
  }

  solutions := []models.Solution{}
  for i := 0; i < tests; i++ {
    fmt.Println("*********************************")
    fmt.Println(fmt.Sprintf("TEST: %v", i+1))
    fmt.Println("*********************************")

    // Read donkeys and bags.
    text, err = read.Read("Enter donkeys and bags number. (Type: 2 6).")
    if err != nil {
      log.Fatal(errors.Stack(err))
    }
    parts := strings.Split(text, " ")
    if len(parts) > 2 {
      log.Fatal(errors.New("too many arguments in donkeys and bags input"))
    }

    donkeysNumber, err := strconv.Atoi(parts[0])
    if err != nil {
      log.Fatal(errors.Stack(err))
    }
    if donkeysNumber > models.DONKEYS_BAGS_UP_LIMIT || donkeysNumber < models.DONKEYS_BAGS_DOWN_LIMIT {
      log.Fatal(errors.New("donkeys number out of limit."))
    }
    donkeys := []models.Donkey{}
    for i:=0; i < donkeysNumber; i++ {
      donkeys = append(donkeys, models.Donkey{})
    }

    bagsNumber, err := strconv.Atoi(parts[1])
    if err != nil {
      log.Fatal(errors.Stack(err))
    }
    if bagsNumber > models.DONKEYS_BAGS_UP_LIMIT || bagsNumber < models.DONKEYS_BAGS_DOWN_LIMIT {
      log.Fatal(errors.New("bags number out of limit."))
    }

    // Read weights
    text, err = read.Read("Enter bags weights. (Type: 2 2 3 3 4 4).")
    if err != nil {
      log.Fatal(errors.Stack(err))
    }
    weightParts := strings.Split(text, " ")
    if bagsNumber != len(weightParts) {
      log.Fatal(errors.New(fmt.Sprintf("there should be %v bags weight and have %v", bagsNumber, len(weightParts))))
    }
    bags := []models.Bag{}
    for _, part := range weightParts {
      weight, err := strconv.Atoi(part)
      if err != nil {
        log.Fatal(errors.New(fmt.Sprintf("invalid bag weight %s", part)))
      }
      if weight > models.BAG_WEIGHT_UP_LIMIT || weight < models.BAG_WEIGHT_DOWN_LIMIT {
        log.Fatal(errors.New("bags number out of limit."))
      }

      bags = append(bags, models.NewBag(weight))
    }

    // Call algorithm
    solutions = append(solutions, models.NewSolution(donkeys, bags))
  }