package ru.job4j.tracker;

public class Item {

    private String id;
    private String name;
    private String description;
    private long create;
    private String codeId;


    public Item(String name, String description, String id) {

        this.name = name;
        this.description = description;
        this.create = create;
        this.codeId = codeId;
        this.id = id;
    }


       public String getName() {
            return this.name;
        }
        public String getDescription() {
            return this.description;
        }

       public long getCreate() {
         return this.create;
      }

        public String getId() {
            return this.id;
        }

        public String setId(String id) {
            return this.id;

        }


}
