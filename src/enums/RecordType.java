package enums;

public enum RecordType {
    THELITTLEBOOK("книжечка", 50),
    NOTEBOOK("блокнот", 20),
    PIECEOFPAPER("лист бумаги", 10);

    private final String description;
    private final int capacity;

    RecordType(String description, int capacity) {
        this.description = description;
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return this.description;
    }

    public int getCapacity(){
        return this.capacity;
    }

    public static RecordType getByCapacity(int capacity){
        for (RecordType type : values()){
            if (type.capacity == capacity){
                return type;
            }
        }
        return null;
    }

    public boolean hasSpaceFor(int entries) {
        return entries <= capacity;
    }
}
