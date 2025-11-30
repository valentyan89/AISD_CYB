public enum Action {
    ADD,
    DELETE,
    PRINT,
    FIND,
    EXIT;
    public static Action choose(String input) {
        return switch (input.trim()) {
            case "1" -> ADD;
            case "2" -> DELETE;
            case "3" -> FIND;
            case "4" -> PRINT;
            case "5" -> EXIT;
            default -> null;
        };
    }
}
