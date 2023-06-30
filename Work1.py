import random
randomNumber = random.randint(1, 100)
correct = False
print(randomNumber)

for i in range(3):
    userInput = int(input())

    if userInput > randomNumber:
        print("Too high, try again")
    elif userInput < randomNumber:
        print("Too low, try again")
    else:
        print("Your answer is correct")
        correct = True
        break

if not correct:
    print("Out of attempts")
