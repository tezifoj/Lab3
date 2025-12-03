package enums;

public enum RecordType {
    THELITTLEBOOK("книжечка"),
    NOTEBOOK("блокнот"),
    PIECEOFPAPER("лист бумаги");

    private final String description;

    RecordType(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return this.description;
    }
}
