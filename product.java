class product{
    int pcode;
    String pname;
    int price;
    product(int pcode,String pname,int price)
    {
        this.pcode=pcode;
        this.pname=pname;
        this.price=price;
    }
    public static void main(String[] arge)
    {
        product p1=new product(101,"eraser",10);
        product p2=new product(101,"pen",15);
        product p3=new product(101,"notebook",5);
        product lowest=p1;
        if(p2.price<lowest.price)
    {
        lowest=p2;
    }
    if(p3.price<lowest.price)
    {
        lowest=p3;
    }
    System.out.println("product with the lowest price is:");
    System.out.println("product code"+lowest.pcode);
    System.out.println("product name"+lowest.pname);
    System.out.println("product price"+lowest.price);
    }
}