package homework_14.Qnarik_Khachatryan.chapter_14.bridge_method;


//the subclass Gen2 extends Gen, but does
//so using a String-specific version of Gen
class Gen2 extends Gen<String> {

    Gen2(String o) {
        super(o);
    }

    //A String-specific override of getOb().

    //    inside Gen2, getOb( ) is overridden with
//    String specified as the return type
    String getOb() {
        System.out.print("You called String getOb(): ");
        return ob;
    }


}
