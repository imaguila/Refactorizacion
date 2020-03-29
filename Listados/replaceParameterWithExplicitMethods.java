// Problem
void setValue(String name, int value) {
  if (name.equals("height")) {
    height = value;
    return;
  }
  if (name.equals("width")) {
    width = value;
    return;
  }
  Assert.shouldNeverReachHere();
}

// Solution
void setHeight(int arg) {
  height = arg;
}
void setWidth(int arg) {
  width = arg;
}