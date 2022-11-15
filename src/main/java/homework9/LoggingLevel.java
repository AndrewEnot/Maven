package homework9;

public enum LoggingLevel {

  ERROR(0),
  WARN(1),
  INFO(2),
  DEBUG(3),
  TRACE(4);

  final int priority;

  LoggingLevel(int priority) {
    this.priority = priority;
  }
}
