def getIntegerInput():
    while True:
        try:
            number = int(input("Enter an integer: "))  # Get user input
            return number  # Return the valid integer
        except ValueError:
            print("Invalid input. Please enter a valid integer.")  # Error handling

def checkEvenOrOdd(number):
    if number % 2 == 0:
        return f"{number} is an Even number."
    else:
        return f"{number} is an Odd number."

# Main Program Flow
num = getIntegerInput()  # Get integer input from user
result = checkEvenOrOdd(num)  # Check if it's even or odd
print(result)  # Display the result
