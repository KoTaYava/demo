package pro.sky.java.course1.leson1;

public class Author {
    private String name;
    private String surName;
    public Author(String name, String surName) {
        this.name = name;
        this.surName = surName;

    }
    public String getName() {
        return this.name;
    }

    public String getSurName() {
        return this.surName;
    }
    @Override
    public String toString(){
        return this.name + this.surName;
    }
    @Override
    public boolean equals(Object other) {

        if (this.getClass() != other.getClass()) {
            return false;
        }
        Author author = (Author) other;
        return name.equals(author.name) && surName.equals(author.surName);
    }
    @Override
    public int hashCode(){
        return java.util.Objects.hash(name,surName);
    }
}
