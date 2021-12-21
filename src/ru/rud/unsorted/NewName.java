package ru.rud.unsorted;

public class NewName {
    private String firstName;
    private String secondName;
    private String patronName;

    private NewName(BuilderName builder) {
        this.firstName = builder.firstName;
        this.secondName = builder.secondName;
        this.patronName = builder.patronName;
    }

    public String toString() {
        String fullName = "";
        if (firstName != null) fullName += firstName + " ";
        if (secondName != null) fullName += secondName + " ";
        if (patronName != null) fullName += patronName + " ";
        return fullName;
    }

    public static class BuilderName {
        private String firstName;
        private String secondName;
        private String patronName;

        public BuilderName() {
        }

        public BuilderName setName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        public BuilderName setSurName(String secondName) {
            this.secondName = secondName;
            return this;
        }

        public BuilderName setSecondName(String patronName) {
            this.patronName = patronName;
            return this;
        }

        public NewName build() {
            return new NewName(this);
        }

    }
}