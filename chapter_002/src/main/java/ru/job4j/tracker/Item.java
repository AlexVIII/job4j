package ru.job4j.tracker;

public class Item {
    private String id;

    private String name;

    private String description;

    private long create;

    private String codeId;

    public Item(String name, String description, String codeId, String id, long create) {
        this.name = name;
        this.description = description;
        this.create = create;
        this.codeId = codeId;
        this.id = id;
    }

    public String getName(){
            return this.name;
        }
        public String getDescription(){
            return this.description;
        }
        public String getCreate() {
            return this.create;
        }
        public String getId() {
            return this.id;
        }

        public String setId() {
            this.id = id;
        }


}
