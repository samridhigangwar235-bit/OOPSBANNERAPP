public class UC5 {
    /**
 * OOPS Banner App - Use Case 4
 * Displays "OOPS" using String array and loop
 *
 * @author Prince Raj
 * @version 4.0
 */

    public static void main(String[] args) {

        String[] banner = {

                String.join("   ",
                        " ***** ",
                        " ***** ",
                        " ***** ",
                        " ***** "),

                String.join("   ",
                        "*     *",
                        "*     *",
                        "*     *",
                        "*      "),

                String.join("   ",
                        "*     *",
                        "*     *",
                        "*     *",
                        "*      "),

                String.join("   ",
                        "*     *",
                        "*     *",
                        " ***** ",
                        " ***** "),

                String.join("   ",
                        "*     *",
                        "*     *",
                        "*      ",
                        "     * "),

                String.join("   ",
                        "*     *",
                        "*     *",
                        "*      ",
                        "     * "),

                String.join("   ",
                        " ***** ",
                        " ***** ",
                        "*      ",
                        " ***** ")
        };

        for (String line : banner) {
            System.out.println(line);
        }
    }
}