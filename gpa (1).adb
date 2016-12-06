WITH Ada.Text_IO;
USE Ada.Text_IO;
WITH Ada.Integer_Text_IO;
USE Ada.Integer_Text_IO;
WITH Ada.Float_Text_IO;
USE Ada.Float_Text_IO;

PROCEDURE Gpa IS

   Points,
   Hours,
   X              : Integer   := 0;
   CurrentGPA,
   TargetGPA,
   NewGPA         : Float     := 0.00;
   GradeLetter    : Character;
   TotalPoints    : Natural;
   TotalHours     : Natural;
   ClassPoints    : Natural;
   Deficit        : Float;
   Y              : Integer   := 0;
   NewClassPoints : Integer;
   NewTotalHours  : Integer;
   NewDeficit     : Float;
   N              : Integer   := 1;
   Surplus        : Float;
   Z              : Integer   := 0;
BEGIN
   WHILE (N > 0)LOOP
      ClassPoints := 0;
      TotalHours := 0;
      TargetGPA := 0.00;
      TotalPoints := 0;
      Get(N);
      Z := Z + 1;
      IF N = 0 THEN
         EXIT;
      END IF;
      Points := 0;

      FOR Index IN 1..N LOOP
         Get (Hours);
         Get (GradeLetter);
         Points := 0;

         IF(GradeLetter = 'A')THEN
            X := 4;

         ELSIF(GradeLetter = 'B')THEN
            X := 3;

         ELSIF(GradeLetter='C')THEN
            X := 2;

         ELSIF(GradeLetter='D')THEN
            X:=1;

         ELSIF(GradeLetter = 'F')THEN
            X:=0;

         END IF;
         Points :=Points + X;
         TotalHours := TotalHours + Hours;
         ClassPoints := Points * Hours;
         TotalPoints := ClassPoints + TotalPoints;

      END LOOP;
      Get(TargetGPA);
      CurrentGpa := Float(TotalPoints) / Float(TotalHours);
      Put("*********************");
      New_Line;
      Put("Data Set: ");
      Put(Z);
      New_Line;
      Put("*********************");
      New_Line;
      Put("Current points: ");
      Put(TotalPoints,5);
      New_Line;
      Put ("Current hours: ");
      Put(TotalHours,6);
      New_Line;
      Put("Current GPA:    ");
      Put(CurrentGpa,2,2,0);

      New_Line;
      Put("Target GPA:      ");
      Put(TargetGPA,0,2,0);
      New_Line;
      NewTotalHours := TotalHours;
      NewClassPoints := ClassPoints;
      IF(TargetGPA > CurrentGPA)THEN
         Put("Points deficit:  ");
         Deficit := TargetGPA - CurrentGPA;
         NewDeficit := Deficit;
         Put(Deficit,0,2,0 * 10);
         New_Line;
         IF (TargetGPA < 4.0)THEN
            Deficit := NewDeficit;
            TotalHours := NewTotalHours;
            ClassPoints := NewClassPoints;
            New_Line;
            Put("Higher grade:       A");
            New_Line;
            Y := 0;
            WHILE (Deficit > 0.00) LOOP
               ClassPoints := ClassPoints + 4;
               TotalHours := TotalHours + 1;
               CurrentGPA := Float(ClassPoints) / Float(TotalHours);
               Deficit := TargetGPA - CurrentGPA;
               Y := Y + 1;
            END LOOP;
            NewGPA := Float(ClassPoints) / Float(TotalHours);
            Put("Hours needed:");
            Put(Y,8);
            New_Line;
            Put("New surplus:     ");
            Put(Deficit,0,2,0);
            New_Line;
            Put("Resulting GPA:   ");
            Put(NewGPA,0,2,0);
            New_Line;

         END IF;

         IF (TargetGPA < 3.0)THEN
            Deficit := NewDeficit;
            TotalHours := NewTotalHours;
            ClassPoints := NewClassPoints;
            New_Line;
            Put("Higher grade:       B");
            New_Line;
            Y := 0;
            WHILE (Deficit > 0.00) LOOP
               ClassPoints := ClassPoints + 3;
               TotalHours := TotalHours + 1;
               CurrentGPA := Float(ClassPoints) / Float(TotalHours);
               Deficit := TargetGPA - CurrentGPA;
               Y := Y + 1;
            END LOOP;
            NewGPA := Float(ClassPoints) / Float(TotalHours);
            Put("Hours needed:");
            Put(Y,8);
            New_Line;
            Put("New surplus:     ");
            Put(Deficit,0,2,0);
            New_Line;
            Put("Resulting GPA:   ");
            Put(NewGPA,0,2,0);
            New_Line;

         END IF;


         IF (TargetGPA < 2.0)THEN
            Deficit := NewDeficit;
            TotalHours := NewTotalHours;
            ClassPoints := NewClassPoints;
            New_Line;
            Put("Higher grade:       C");
            New_Line;
            Y := 0;
            WHILE (Deficit > 0.00) LOOP
               ClassPoints := ClassPoints + 2;
               TotalHours := TotalHours + 1;
               CurrentGPA := Float(ClassPoints) / Float(TotalHours);
               Deficit := TargetGPA - CurrentGPA;
               Y := Y + 1;
            END LOOP;
            NewGPA := Float(ClassPoints) / Float(TotalHours);
            Put("Hours needed:");
            Put(Y,8);
            New_Line;
            Put("New surplus:     ");
            Put(Deficit,0,2,0);
            New_Line;
            Put("Resulting GPA:   ");
            Put(NewGPA,0,2,0);
            New_Line;

         END IF;

         IF (TargetGPA < 1.0)THEN
            Deficit := NewDeficit;
            TotalHours := NewTotalHours;
            ClassPoints := NewClassPoints;
            New_Line;
            Put("Higher grade:       D");
            New_Line;
            Y := 0;
            WHILE (Deficit > 0.00) LOOP
               ClassPoints := ClassPoints + 1;
               TotalHours := TotalHours + 1;
               CurrentGPA := Float(ClassPoints) / Float(TotalHours);
               Deficit := TargetGPA - CurrentGPA;
               Y := Y + 1;
            END LOOP;
            NewGPA := Float(ClassPoints) / Float(TotalHours);
            Put("Hours needed:");
            Put(Y,8);
            New_Line;
            Put("New surplus:     ");
            Put(Deficit,0,2,0);
            New_Line;
            Put("Resulting GPA:   ");
            Put(NewGPA,0,2,0);
            New_Line;

         END IF;


         IF (TargetGPA > 4.0) THEN
            Put("Target GPA is impossibble to reach.");
         END IF;
      END IF;
      IF(TargetGPA < CurrentGPA)THEN
         Put("Points surplus: ");
         Surplus := CurrentGPA - TargetGPA;
         Put(Surplus,0,2,0);
      END IF;
      New_Line;

   END LOOP;

END;
