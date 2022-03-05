package Collections.Set;

import java.util.Comparator;

public class OrderNoteComparator implements Comparator<Student> {
    // notları küçükten büyüğe sıralar tersi için .reversed() yazılmalı nesne üretilen yerde.
    @Override
    public int compare(Student o1, Student o2) {
        return o1.getNote() - o2.getNote();
    }
}
