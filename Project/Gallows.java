package Project;

public class Gallows {
    public void gallows(int number){
        switch (number){
            case 1: System.out.println(" \n" +
                        "  \n" +
                        "  \n" +
                        "                          \n" +
                        "  ______                         \n" +
                        "  |     |                   \n" +
                        "  |                         \n" +
                        "  |                         \n" +
                        "  |                         \n" +
                        "  |\n" +
                        "  |                                        \n" +
                        "--------------                       \n"
                        );
            break;
            case 3: System.out.println(" \n" +
                    "  \n" +
                    "  \n" +
                    "                          \n" +
                    "  ______                         \n" +
                    "  |     |                   \n" +
                    "  |     o                    \n" +
                    "  |                         \n" +
                    "  |                         \n" +
                    "  |\n" +
                    "  |                                        \n" +
                    "-------------- ");break;
            case 5: System.out.println("                          \n" +
                    "  ______                         \n" +
                    "  |     |                   \n" +
                    "  |     o                    \n" +
                    "  |     |                    \n" +
                    "  |                         \n" +
                    "  |\n" +
                    "  |                                        \n" +
                    "--------------     ");break;
            case 7:
                System.out.println(" \n" +
                        "  \n" +
                        "  \n" +
                        "                          \n" +
                        "  ______                         \n" +
                        "  |     |                   \n" +
                        "  |     o                    \n" +
                        "  |     |                    \n" +
                        "  |    /                    \n" +
                        "  |\n" +
                        "  |                                        \n" +
                        "--------------  ");break;
            case 9:
                System.out.println(" \n" +
                        "  \n" +
                        "  \n" +
                        "                          \n" +
                        "  ______                         \n" +
                        "  |     |                   \n" +
                        "  |     o                    \n" +
                        "  |     |                    \n" +
                        "  |    / \\                   \n" +
                        "  |\n" +
                        "  |                                        \n" +
                        "--------------     ");break;
            case 11:
                System.out.println(" \n" +
                        "  \n" +
                        "  \n" +
                        "                          \n" +
                        "  ______                         \n" +
                        "  |     |                   \n" +
                        "  |    \\o                    \n" +
                        "  |     |                    \n" +
                        "  |    / \\                   \n" +
                        "  |\n" +
                        "  |                                        \n" +
                        "--------------   ");break;
            case 13:
                System.out.println(" \n" +
                        "  \n" +
                        "  \n" +
                        "                          \n" +
                        "  ______                         \n" +
                        "  |     |                   \n" +
                        "  |    \\o/                    \n" +
                        "  |     |                    \n" +
                        "  |    / \\                   \n" +
                        "  |\n" +
                        "  |                                        \n" +
                        "--------------\n" +
                        "You lost!                       \n" +
                        "             ");break;
        }

    }
}
