public class Ring {
    Fighter f1;
    Fighter f2;
    int minWeight;
    int maxWeight;

    public Ring(Fighter f1, Fighter f2, int minWeight, int maxWeight) {
        this.f1 = f1;
        this.f2 = f2;
        this.minWeight = minWeight;
        this.maxWeight = maxWeight;
    }

    public void run() {
        if (!checkWeight()) {
            System.out.println("Sporcularin agirliklarinin uyusmuyor.");
            return;
        }

        // Homework: 50% chance to decide who goes first
        Fighter first = Math.random() < 0.5 ? f1 : f2;
        Fighter second = first == f1 ? f2 : f1;
        System.out.println("Ilk vuracak: " + first.name);

        while (f1.health > 0 && f2.health > 0) {
            System.out.println("======== YENI ROUND ===========");
            second.health = first.hit(second);
            if (isWin()) break;
            first.health = second.hit(first);
            if (isWin()) break;
            printScore();
        }
    }

    public boolean checkWeight() {
        return (f1.weight >= minWeight && f1.weight <= maxWeight)
            && (f2.weight >= minWeight && f2.weight <= maxWeight);
    }

    public boolean isWin() {
        if (f1.health <= 0) {
            System.out.println("Maci Kazanan: " + f2.name);
            return true;
        } else if (f2.health <= 0) {
            System.out.println("Maci Kazanan: " + f1.name);
            return true;
        }
        return false;
    }

    public void printScore() {
        System.out.println("------------");
        System.out.println(f1.name + " Kalan Can: " + f1.health);
        System.out.println(f2.name + " Kalan Can: " + f2.health);
    }
}
