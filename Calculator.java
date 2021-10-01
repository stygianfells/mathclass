
//alas
//i want coffee
//but gotta do void stuff i guess
//elaine yang ap comp sci sep30 oh shoot it's due today
//AAAAAAAAHHHH

class Calculator {
    
    private double a, b, c, x1, y1, x2, y2, a1, a2, ga, r;
    private int k, n;
    
    public Calculator() {
        //variables abound
        a=2;
        b=9;
        c=3;
        
        x1=5;
        x2=8;
        y1=6;
        y2=3;
        
        a1=9;
        a2=6;
        k=3;
        
        ga=2;
        r=1.5;
        n=3;
    }
    //quadratic pluss and minuss (ask Maragaret Atwood why I added an s)
    double quadraticpluss() {
        double top=(b*-1)+Math.sqrt(b*b-4*a*c);
        double bottom=2*a;
        return top/bottom;
    }
    double quadraticminuss() {
        double atop=(b*-1)-Math.sqrt(b*b-4*a*c);
        double bottom=2*a;
        return atop/bottom;
    }
    //downhill
    double slopeyjoe() {
        double no=(y2-y1)/(x2-x1);
        return no;
    }
    //mid
    double xmid() {
        double midx = ((x1+x2)/2);
        double midy = ((y1+y2)/2);
        return midx;
    }
    double ymid() {
        double midx = ((x1+x2)/2);
        double midy = ((y1+y2)/2);
        return midy;
    }
    //arithmetic
    double arithtotle() {
        double borb = a1+(k-1)*a2;
        return borb;
    }
    //geometric
    double gecometric() {
        double walnut = (ga-ga*Math.pow(r, n))/(1-r);
        return walnut;
    }
    //the fruits of my labour
    public void display() {
        System.out.println("QUADRATIC FORMULA");
        System.out.println("The solutions for "+a+"x^2 + "+b+" x + "+c+" are: "+quadraticpluss()+", "+quadraticminuss());
        System.out.println("SLOPE FORMULA");
        System.out.println("A line connecting the points ("+x1+", "+y1+") and ("+x2+", "+y2+") has the slope "+slopeyjoe());
        System.out.println("MIDPOINT FORMULA");
        System.out.println("The midpoint between ("+x1+", "+y1+") and ("+x2+", "+y2+") is ("+xmid()+", "+ymid()+")");
        System.out.println("SUM OF ARITHMETIC SERIES");
        System.out.println("The sum of the first "+k+" terms of an arithmetic series that starts with "+a1+"and increases by "+a2+" is "+arithtotle());
        System.out.println("SUM OF A FINITE GEOMETRIC SERIES");
        System.out.println("The sum of the first "+n+" terms of an arithmetic series that starts with "+ga+"and increases by a rate of "+r+" is "+gecometric());
    }
    }
