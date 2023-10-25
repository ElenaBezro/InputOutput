Morning session

Exercise 1: Reading from a File
Ask your students to create a Java program that reads text from a file called "input.txt" using FileReader.
Instruct them to display the content of the file on the console.
Exercise 2: Writing to a File
Have your students create a Java program that writes a sentence of their choice to a file called "output.txt" using FileWriter.
Encourage them to use FileWriter to write the sentence to the file.
Exercise 3: Copying a File
Challenge your students to create a Java program that reads content from one file (e.g., "source.txt") using FileReader and writes it to another file (e.g., "destination.txt") using FileWriter.
Make sure they handle any potential exceptions that may occur during file operations.
Exercise 4: Appending to a File
Instruct your students to modify the previous program to append additional text to the "destination.txt" file instead of overwriting its content.
They should use FileWriter in append mode to achieve this.
Exercise 5: Reading and Writing Numbers
Have your students create a program that reads a series of integers from an "input_numbers.txt" file using FileReader.
Then, ask them to calculate the sum of these numbers and write the result to an "output_sum.txt" file using FileWriter.
Exercise 6: Error Handling
Introduce error handling by asking your students to modify their programs to handle exceptions that may occur during file operations (e.g., FileNotFoundException, IOException).
Encourage them to use try-catch blocks to gracefully handle these exceptions.

Morning session 
Second part

Exercise: Text Collector with Uniqueness

Objective:
Develop an application that continuously collects textual input from a user, ensuring that duplicate words aren't saved. When the user types "Export", save all the unique words to the "output.txt" file. If the user runs the app multiple times, always ensure that the previous inputs are maintained, and show the existing content to the user upon starting the app.

Steps:

When the app starts, read the "output.txt" file (if it exists) and display its content to the user.
Continuously prompt the user for text input.
Check the word for uniqueness against previously entered words and the existing file content.
If the user types "Export", append the new unique words to the "output.txt" file.
If the app is run again, repeat the above steps.

------------------------------------------------------------------------------------------------------------------------

Exercise 2: Line Counter

Objective: Create a Java program that reads a text file and counts the number of lines in it.

Instructions:

Use the FileReader and BufferedReader classes to read the text file line by line.
Count the number of lines and display it to the user.

Sample Input:
Hello world!
How are you today?
It's a beautiful day.

Sample Output:
Total number of lines: 3

------------------------------------------------------------------------------------------------------------------------

Exercise 3: Convert to Uppercase

Objective: Create a Java program that reads a text file, converts all of its content to uppercase, and then writes the result to a new file.

Instructions:

Read the input text file using FileReader.
Convert each line to uppercase.
Write the converted lines to a new output file using FileWriter.

Sample Input:
Hello world!

Sample Output (in a new file):
HELLO WORLD!

------------------------------------------------------------------------------------------------------------------------

Exercise 4: Duplicate Word Finder

Objective: Create a Java program that reads a text file and identifies any word that appears more than once.

Instructions:

Read the text file and split it into words.
Use a Set or Map to help identify duplicate words.
Display any duplicates to the user.

Sample Input:
Java is fun. Java is powerful.

Sample Output:
arduino

Duplicate word: Java
Duplicate word: is

Evening Session

Exercise 1

Modify your program to create a list of users' names, ages, emails,
phone numbers, and addresses. Save it to a CSV file using FileWriter.
Each line should represent one user's data.

Exercise 2

Implement reading and displaying the user data from the CSV file
using FileReader.

Exercise 3

Allow users to add new entries to the CSV file and ensure that the file
remains properly formatted.

Exercise 4

Create a feature that allows the user to search for a user's data by
name, email, or phone number and display the results.

Exercise 5

Implement a sorting mechanism to sort users in the CSV file based on
their ages or names.

Exercise 6

Create a function that allows the user to update their address in the
CSV file and display the updated information.

Exercise 7

Implement a feature that allows users to remove a specific user's data
from the CSV file based on their name or email.

Exercise 8

Add a menu system that lets the user choose different options (e.g.,
add a new user, search, update, delete) within the program.

Exercise 9

Implement a function to count and display the total number of users
in the CSV file.

Exercise 10

Create a CSV report file with all user data, including headers.
