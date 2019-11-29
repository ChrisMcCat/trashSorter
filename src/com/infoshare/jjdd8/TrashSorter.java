package com.infoshare.jjdd8;

public class TrashSorter {

    private TrashBin<Bio> bioTrashBin = new TrashBin<>();
    private TrashBin<Plastic> plasticTrashBin = new TrashBin<>();
    private TrashBin<Paper> paperTrashBin = new TrashBin<>();
    private TrashBin<Glass> glassTrashBin = new TrashBin<>();
    private TrashBin<Object> mixedTrashBin = new TrashBin<>();

    public void sortTrash(Object trash) {
        if (trash instanceof Bio) {
            bioTrashBin.throwOut((Bio) trash);
        }
        else if (trash instanceof Plastic) {
            plasticTrashBin.throwOut((Plastic) trash);
        }
        else if (trash instanceof Paper) {
            paperTrashBin.throwOut((Paper) trash);
        }
        else if (trash instanceof Glass) {
            glassTrashBin.throwOut((Glass) trash);
        }
        else {
            mixedTrashBin.throwOut(trash);
        }
    }

    public void showTrashCount() {
        System.out.println("Bio count: "+ bioTrashBin.howMany());
        System.out.println("Plastic count: "+ plasticTrashBin.howMany());
        System.out.println("Paper count: "+ paperTrashBin.howMany());
        System.out.println("Glass count: "+ glassTrashBin.howMany());
        System.out.println("Mixed count: "+ mixedTrashBin.howMany());
    }

    public static void main(String[] args) {
        TrashSorter trashSorter = new TrashSorter();
        trashSorter.sortTrash(new Glass());
        trashSorter.sortTrash(new Glass());
        trashSorter.sortTrash(new Plastic());
        trashSorter.sortTrash(new Bio());
        trashSorter.sortTrash(new String());
        trashSorter.sortTrash(new Paper());

        trashSorter.showTrashCount();
    }

}