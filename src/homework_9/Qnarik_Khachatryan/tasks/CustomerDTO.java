package homework_9.Qnarik_Khachatryan.tasks;


class CustomerDTO {
    @Length
    private static String name;

    @Email("")
    private static String email;

    @Adulthood
    private static int age;

    @Min(0)
    @Max(100)
    private int discountRate;


    CustomerDTO(String name, String email, int age, int discountRate){
        this.name = name;
        this.age = age;
        this.email = email;
        this.discountRate = discountRate;
    }
}
