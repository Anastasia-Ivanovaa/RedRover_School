package lessons.l2;

public class Fishers {
    public static void main(String[] args) {
        Catch[] allCatchers = {
                makeCatch("Bob", "salmon", 15, true),
                makeCatch("Steve", "sturgeon", 20, false),
                makeCatch("Sam", "salmon", 17, false),
                makeCatch("Ann", "salmon", 10, false)
        };

        printArray(allCatchers);
        System.out.println(totalWeight(allCatchers, "salmon"));

        MinMaxCatches records = getMinMaxCatch(allCatchers);
        System.out.println("Congratulations to " + records.max.fisher + " for catching " + records.max.weight + " kg of" + records.max.fishKind);
        System.out.println("Congratulations to " + records.min.fisher + " for catching " + records.min.weight + " kg of" + records.min.fishKind);


    }

    static Catch makeCatch(String fisher, String fishKind, double weight, boolean released) {
        Catch c = new Catch();
        c.fisher = fisher;
        c.fishKind = fishKind;
        c.weight = weight;
        c.released = released;
        return c;
    }

    static void printArray(Catch[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i].makeString());
        }
    }

    static double totalWeight(Catch[] catches, String fishKind) {
        double weight = 0.0;
        for (int i = 0; i < catches.length; i++) {
            if (fishKind.equals(catches[i].fishKind)) {
                if (!catches[i].released) {
                    weight += catches[i].weight;
                }
            }
        }
        return weight;
    }

    static MinMaxCatches getMinMaxCatch(Catch[] array) {
        MinMaxCatches result = new MinMaxCatches();
        for (Catch element : array) {
            if (result.max == null || element.weight > result.max.weight) {
                result.max = element;
            }
            if (result.min == null || element.weight < result.min.weight) {
                result.min = element;
            }
        }
        return result;
    }


}
