package ru.job4j.tracker;

public class Item {
<<<<<<< HEAD
    private String id;

    private String name;

    private String description;

    private long create;
=======
    public String id;

    public String name;

    public String description;

    public long create;
>>>>>>> origin/master

    private String codeId;

    public Item(String name, String description, String codeId, String id, long create) {
        this.name = name;
        this.description = description;
        this.create = create;
        this.codeId = codeId;
        this.id = id;
    }

<<<<<<< HEAD
    public String getName(){
=======
       public String getName(){
>>>>>>> origin/master
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
