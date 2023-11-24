package NestedClass.DurgaNotes;

public class BoardExam {
    public void tenth()
    {
        int passingMarks=40;

        class Subjects
        {
            public void Marks()
            {
                System.out.println(passingMarks);
            }
        }
        Subjects s = new Subjects();
        s.Marks();
    }
    public static void main(String[] args) {
        BoardExam b = new BoardExam();
        b.tenth();
    }
}
