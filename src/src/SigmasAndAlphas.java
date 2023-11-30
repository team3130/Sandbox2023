public class SigmasAndAlphas {
    // INSTANCE VARIABLES
    public int size;
    public int sigma_starlevel;
    public int aplha_starlevel;
    public double weight;
    public String species;
    public String name;


    // CONSTRUCTOR
    public SigmasAndAlphas(String name, String species, int size, int sigma_starlevel, int alpha_starlevel){
        this.size = size;
        this.sigma_starlevel = sigma_starlevel;
        this.aplha_starlevel = alpha_starlevel;
        this.weight = weight;
        this.species = species;
        this.name = name;
    }
    // METHODS
    public int getSize() {
        return size;
    }
    public double getWeight() {return weight;}
    public void setSize(int newSize) {
        this.size = newSize;
    }
    public void setWeight(double newWeight) {
        this.weight = newWeight;
    }
    public void printColor(String color) {
        System.out.println(color);
    }
    public void addWeight(double addedWeight) {
        double newWeight = weight + addedWeight;
        System.out.println(newWeight);
    }
    public static void main(String[] args){
        SigmasAndAlphas sigma = new SigmasAndAlphas("henry", "sigma", 7, 9, 0);
        SigmasAndAlphas alpha = new SigmasAndAlphas("winston", "alpha", 4, 0, 5);
    }


}

