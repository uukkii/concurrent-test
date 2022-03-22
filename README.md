## Домашнее задание к занятию 1.4 Коллекции для параллельной (конкурирующей) работы.
### Задача 1. Колл-центр

**v. 1.1**

Замечания учтены. 

Теперь метод класса **Staff** выглядит следующим образом:
```
    @Override
    public void run() {
        while (!queue.isEmpty()) {
            try {
                Integer nextElementOfQueue = queue.poll();
                System.out.printf("\nSpecialist %s is answering on request # %d", Thread.currentThread().getName(), nextElementOfQueue);
                Thread.sleep(ON_LINE);
            } catch (InterruptedException exception) {
                exception.printStackTrace();
            }
        }
    }
```

Также список сотрудников перенесен из основного класса **Application** в класс **Staff**.

Вывод в консоль после выполнения:
```
On hold are 119 calls!

Specialist John is answering on request # 1
Specialist Lucy is answering on request # 10
Specialist Shang is answering on request # 9
Specialist Rajesh is answering on request # 8
Specialist Judy is answering on request # 7
Specialist Pamela is answering on request # 6
Specialist Lex is answering on request # 5
Specialist Amanda is answering on request # 4
Specialist Alex is answering on request # 3
Specialist Mike is answering on request # 2
Specialist John is answering on request # 11
Specialist Judy is answering on request # 12
Specialist Shang is answering on request # 15
Specialist Lucy is answering on request # 14
Specialist Rajesh is answering on request # 13
Specialist Pamela is answering on request # 19
Specialist Lex is answering on request # 17
Specialist Amanda is answering on request # 18
Specialist Alex is answering on request # 16
Specialist Mike is answering on request # 20
Specialist John is answering on request # 21
Specialist Judy is answering on request # 22
Specialist Shang is answering on request # 23
Specialist Lucy is answering on request # 24
Specialist Lex is answering on request # 25
Specialist Rajesh is answering on request # 26
Specialist Pamela is answering on request # 27
Specialist Mike is answering on request # 28
Specialist Amanda is answering on request # 30
Specialist Alex is answering on request # 29
Specialist Judy is answering on request # 31
Specialist Shang is answering on request # 32
Specialist Lex is answering on request # 33
Specialist Lucy is answering on request # 34
Specialist Rajesh is answering on request # 35
Specialist Mike is answering on request # 36
Specialist Pamela is answering on request # 37
Specialist Alex is answering on request # 40
Specialist John is answering on request # 39
Specialist Amanda is answering on request # 38
Specialist Lex is answering on request # 41
Specialist Lucy is answering on request # 42
Specialist Pamela is answering on request # 43
Specialist Shang is answering on request # 47
Specialist Judy is answering on request # 46
Specialist Mike is answering on request # 45
Specialist Rajesh is answering on request # 44
Specialist John is answering on request # 49
Specialist Alex is answering on request # 48
Specialist Amanda is answering on request # 50
Specialist Lex is answering on request # 51
Specialist Lucy is answering on request # 52
Specialist Shang is answering on request # 53
Specialist Pamela is answering on request # 54
Specialist Judy is answering on request # 55
Specialist Mike is answering on request # 56
Specialist Alex is answering on request # 57
Specialist John is answering on request # 59
Specialist Rajesh is answering on request # 58
Specialist Amanda is answering on request # 60
Specialist Shang is answering on request # 61
Specialist Pamela is answering on request # 62
Specialist Judy is answering on request # 63
Specialist Lex is answering on request # 64
Specialist Mike is answering on request # 66
Specialist Lucy is answering on request # 65
Specialist Alex is answering on request # 67
Specialist John is answering on request # 68
Specialist Rajesh is answering on request # 69
Specialist Amanda is answering on request # 70
Specialist Shang is answering on request # 71
Specialist Mike is answering on request # 72
Specialist Lex is answering on request # 73
Specialist Alex is answering on request # 74
Specialist John is answering on request # 77
Specialist Lucy is answering on request # 76
Specialist Judy is answering on request # 78
Specialist Pamela is answering on request # 75
Specialist Rajesh is answering on request # 79
Specialist Amanda is answering on request # 80
Specialist Shang is answering on request # 81
Specialist Mike is answering on request # 82
Specialist Lucy is answering on request # 83
Specialist Judy is answering on request # 84
Specialist John is answering on request # 85
Specialist Alex is answering on request # 86
Specialist Lex is answering on request # 88
Specialist Pamela is answering on request # 87
Specialist Rajesh is answering on request # 89
Specialist Amanda is answering on request # 90
Specialist Shang is answering on request # 92
Specialist Mike is answering on request # 91
Specialist Lucy is answering on request # 93
Specialist Judy is answering on request # 94
Specialist Alex is answering on request # 95
Specialist Lex is answering on request # 96
Specialist John is answering on request # 97
Specialist Pamela is answering on request # 98
Specialist Rajesh is answering on request # 99
Specialist Amanda is answering on request # 100
Specialist Shang is answering on request # 101
Specialist Mike is answering on request # 102
Specialist John is answering on request # 103
Specialist Lucy is answering on request # 104
Specialist Judy is answering on request # 108
Specialist Alex is answering on request # 105
Specialist Pamela is answering on request # 107
Specialist Lex is answering on request # 106
Specialist Rajesh is answering on request # 109
Specialist Amanda is answering on request # 110
Specialist Mike is answering on request # 111
Specialist Shang is answering on request # 112
Specialist Judy is answering on request # 113
Specialist Alex is answering on request # 116
Specialist John is answering on request # 115
Specialist Pamela is answering on request # 117
Specialist Lucy is answering on request # 114
Specialist Rajesh is answering on request # 118
Specialist Lex is answering on request # 119
Specialist Amanda is answering on request # 120
Process finished with exit code 0
```

**v. 1.0**

Задание выполнено. Вывод в консоль:
```
On hold are 119 calls!

Specialist John is answering on request # 1
Specialist Lucy is answering on request # 10
Specialist Shang is answering on request # 9
Specialist Rajesh is answering on request # 8
Specialist Judy is answering on request # 7
Specialist Pamela is answering on request # 6
Specialist Lex is answering on request # 4
Specialist Amanda is answering on request # 5
Specialist Alex is answering on request # 3
Specialist Mike is answering on request # 2
Specialist Pamela is answering on request # 11
Specialist John is answering on request # 15
Specialist Rajesh is answering on request # 14
Specialist Lex is answering on request # 17
Specialist Shang is answering on request # 16
Specialist Judy is answering on request # 12
Specialist Lucy is answering on request # 13
Specialist Alex is answering on request # 20
Specialist Mike is answering on request # 19
Specialist Amanda is answering on request # 18
Specialist Rajesh is answering on request # 21
Specialist Amanda is answering on request # 24
Specialist Alex is answering on request # 29
Specialist Lex is answering on request # 30
Specialist Mike is answering on request # 28
Specialist John is answering on request # 27
Specialist Judy is answering on request # 26
Specialist Shang is answering on request # 25
Specialist Lucy is answering on request # 23
Specialist Pamela is answering on request # 22
Specialist Mike is answering on request # 31
Specialist Pamela is answering on request # 36
Specialist Amanda is answering on request # 39
Specialist Shang is answering on request # 40
Specialist Lex is answering on request # 38
Specialist Alex is answering on request # 37
Specialist Lucy is answering on request # 35
Specialist John is answering on request # 34
Specialist Rajesh is answering on request # 32
Specialist Judy is answering on request # 33
Specialist Rajesh is answering on request # 41
Specialist Shang is answering on request # 49
Specialist Lucy is answering on request # 48
Specialist Amanda is answering on request # 47
Specialist Pamela is answering on request # 43
Specialist Mike is answering on request # 46
Specialist Lex is answering on request # 42
Specialist John is answering on request # 44
Specialist Alex is answering on request # 45
Specialist Judy is answering on request # 50
Specialist Pamela is answering on request # 51
Specialist Amanda is answering on request # 55
Specialist Shang is answering on request # 54
Specialist Rajesh is answering on request # 53
Specialist Lucy is answering on request # 52
Specialist Lex is answering on request # 57
Specialist Mike is answering on request # 56
Specialist Judy is answering on request # 60
Specialist Alex is answering on request # 59
Specialist John is answering on request # 58
Specialist Lucy is answering on request # 61
Specialist Rajesh is answering on request # 70
Specialist Shang is answering on request # 69
Specialist Amanda is answering on request # 68
Specialist Mike is answering on request # 67
Specialist Pamela is answering on request # 66
Specialist Alex is answering on request # 65
Specialist Lex is answering on request # 62
Specialist John is answering on request # 64
Specialist Judy is answering on request # 63
Specialist Lucy is answering on request # 71
Specialist John is answering on request # 80
Specialist Mike is answering on request # 79
Specialist Amanda is answering on request # 78
Specialist Pamela is answering on request # 77
Specialist Rajesh is answering on request # 72
Specialist Shang is answering on request # 76
Specialist Lex is answering on request # 75
Specialist Alex is answering on request # 74
Specialist Judy is answering on request # 73
Specialist Amanda is answering on request # 81
Specialist Rajesh is answering on request # 90
Specialist Shang is answering on request # 89
Specialist Pamela is answering on request # 88
Specialist John is answering on request # 85
Specialist Judy is answering on request # 87
Specialist Lucy is answering on request # 86
Specialist Lex is answering on request # 84
Specialist Alex is answering on request # 82
Specialist Mike is answering on request # 83
Specialist Rajesh is answering on request # 91
Specialist Amanda is answering on request # 100
Specialist Lucy is answering on request # 95
Specialist John is answering on request # 99
Specialist Shang is answering on request # 92
Specialist Judy is answering on request # 98
Specialist Pamela is answering on request # 97
Specialist Mike is answering on request # 96
Specialist Lex is answering on request # 94
Specialist Alex is answering on request # 93
Specialist Rajesh is answering on request # 101
Specialist Amanda is answering on request # 103
Specialist Lucy is answering on request # 102
Specialist Shang is answering on request # 104
Specialist John is answering on request # 105
Specialist Pamela is answering on request # 106
Specialist Judy is answering on request # 107
Specialist Lex is answering on request # 108
Specialist Alex is answering on request # 110
Specialist Mike is answering on request # 109
Specialist Amanda is answering on request # 111
Specialist Shang is answering on request # 120
Specialist Alex is answering on request # 119
Specialist Lucy is answering on request # 118
Specialist John is answering on request # 116
Specialist Rajesh is answering on request # 117
Specialist Pamela is answering on request # 115
Specialist Lex is answering on request # 114
Specialist Judy is answering on request # 112
Specialist Mike is answering on request # 113
Process finished with exit code 0
```