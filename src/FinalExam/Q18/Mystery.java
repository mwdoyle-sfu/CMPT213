package FinalExam.Q18;

import java.util.Objects;

public class Mystery {
    private int s1;
    private int s2;
    private int a;

//    <YOUR_CODE_HERE>
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Mystery mystery = (Mystery) o;
        return (s1 == mystery.s1 && s2 == mystery.s2 && a == mystery.a)
                || (s1 == mystery.s2 && s2 == mystery.s1 && a == mystery.a);
    }
}
