package homework_8.Qnarik_Khachatryan.chapter_9.p1;

class SamePackage {
    SamePackage() {
        Protection p = new Protection();
        System.out.println("n = " + p.n);

        //class only
//        System.out.println("n_pri = " + p.n_pri);

        System.out.println("n_pro = " + p.n_pro);
        System.out.println("n_pub = " + p.n_pub);
    }
}
