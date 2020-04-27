double getValueForPeriod (int periodNumber) {
    return (periodNumber >= values.length) ? 0 : values[periodNumber];
  }