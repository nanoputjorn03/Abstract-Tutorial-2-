File for ADT Tutorial 2 by Tat Putjorn 672115024

This Java program processes student data from a CSV file containing SID, First Name, and Last Name. It reads the file, skips the first 7 header lines, and outputs the total number of students. It then counts how many students have first names starting with each letter of the alphabet and displays their details. The program uses a Vector<StudentName> to store the student data, and methods are provided to count and display students based on the starting letter of their first name. To set up the program, ensure you have Java Development Kit (JDK) 8 or later installed and a correctly formatted CSV file with the columns SID, First Name, Last Name. Place the CSV file in the directory specified in the code or update the file path. After compiling the Java files using javac, run the program using the java command, and the output will display student details along with statistics for each letter of the alphabet. The StudentName class represents individual students and provides getter methods and a toString() method to output student details. The program handles file reading, CSV parsing, and statistics calculation, and outputs the results in a clear format. If any errors occur, check the file path or CSV formatting, ensuring the data is structured correctly.

Output: 
622115515 ZHUOYUAN LI
632115004 KAWINTHIDA KRUYTHONG
632115018 NUTCHAYAPORN BUAROM
642115001 KORNKANOK KANCHANA
642115002 KRITTAYOCH JONGCHAISITTIKUL
642115003 KAN KATPARK
642115004 KITDANAI PALEE
642115005 KITTIPAT TACHAMANOKUL
642115006 JAKKAPHAT PLOYLAKE
642115007 JARUWITH BUPPATHEP
642115008 JIRAPAT NAMWONG
642115009 JULALUCK YETA
642115011 YANWARUT SUKSAWAT
642115012 YADA LAKHONJUN
642115013 NATAPHAT KAMMOONJAI
642115015 NICHAKAMOL SANGHONG
642115016 DANAIKRIT JAIWONG
642115017 DUSIT CHUNVISET
642115018 TINNAPAT RATTANAWILAIKUL
642115019 TANINWAT PHUTTICHAIWARANGKUL
642115020 THIWAKON SAKUNCHAO
642115021 TANAKORN WALEECHAROENPONG
642115022 TANAPONG YAMKAMOL
642115023 THANYATORN NOENPOEMPISUT
642115024 THAIPHAT SUKHUMPRAISAN
642115025 NUREMAN SATEEMAE
642115026 PHACHARANAN THUMJAIKUL
642115027 PATTANACHAI NUYAMANG
642115028 PATADOL SRIKHAW
642115029 PITCHAYA AKKAWONG

Total number of students: 30
Count of names starting with a: 0

Count of names starting with b: 0

Count of names starting with c: 0

Count of names starting with d: 2
Students with names starting with d:
642115016 DANAIKRIT JAIWONG
642115017 DUSIT CHUNVISET

Count of names starting with e: 0

Count of names starting with f: 0

Count of names starting with g: 0

Count of names starting with h: 0

Count of names starting with i: 0

Count of names starting with j: 4
Students with names starting with j:
642115006 JAKKAPHAT PLOYLAKE
642115007 JARUWITH BUPPATHEP
642115008 JIRAPAT NAMWONG
642115009 JULALUCK YETA

Count of names starting with k: 6
Students with names starting with k:
632115004 KAWINTHIDA KRUYTHONG
642115001 KORNKANOK KANCHANA
642115002 KRITTAYOCH JONGCHAISITTIKUL
642115003 KAN KATPARK
642115004 KITDANAI PALEE
642115005 KITTIPAT TACHAMANOKUL

Count of names starting with l: 0

Count of names starting with m: 0

Count of names starting with n: 4
Students with names starting with n:
632115018 NUTCHAYAPORN BUAROM
642115013 NATAPHAT KAMMOONJAI
642115015 NICHAKAMOL SANGHONG
642115025 NUREMAN SATEEMAE

Count of names starting with o: 0

Count of names starting with p: 4
Students with names starting with p:
642115026 PHACHARANAN THUMJAIKUL
642115027 PATTANACHAI NUYAMANG
642115028 PATADOL SRIKHAW
642115029 PITCHAYA AKKAWONG

Count of names starting with q: 0

Count of names starting with r: 0

Count of names starting with s: 0

Count of names starting with t: 7
Students with names starting with t:
642115018 TINNAPAT RATTANAWILAIKUL
642115019 TANINWAT PHUTTICHAIWARANGKUL
642115020 THIWAKON SAKUNCHAO
642115021 TANAKORN WALEECHAROENPONG
642115022 TANAPONG YAMKAMOL
642115023 THANYATORN NOENPOEMPISUT
642115024 THAIPHAT SUKHUMPRAISAN

Count of names starting with u: 0

Count of names starting with v: 0

Count of names starting with w: 0

Count of names starting with x: 0

Count of names starting with y: 2
Students with names starting with y:
642115011 YANWARUT SUKSAWAT
642115012 YADA LAKHONJUN

Count of names starting with z: 1
Students with names starting with z:
622115515 ZHUOYUAN LI

