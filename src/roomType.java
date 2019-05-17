enum roomType {
    None("None"), Single("Single"), Double("Double"),
    Luxury("Luxury"), Delux("Delux"), Family("Family");

    private String description;
    private roomType(String description){
        this.description = description;
    }

    public String toString()
    {
        return description;
    }
}
