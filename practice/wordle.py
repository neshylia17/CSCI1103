def check_word(secret, guess):
    clue = ['grey'] * 5
    secret_used = [False] * 5
    guess_used = [False] * 5

    for i in range(5):  # will go through the 5 words
        if secret[i] == guess[i]:  # if secert is the same as guess the turn it green
            clue = 'green'
            secret_used[i] = True
            guess_used[i] = True

    for i in range(5):  # goes through the 5 words
        if clue[i] == 'grey':
            for j in range(5):  # goes  the gray to see which letter is part of guess
                if secret_used[j] and secret[j] != guess[j]:
                    clues[j] = 'yellow'  # will turn yellow if the letter is true but the potion isn't
                    secret_used[j] = True
    return clue



def known_word(clues):
    for i in range(len(clues)):
        if clue[i] == 'green':
            guess[i]
    return clues




def no_letters(clues):
    guessed_grays = set  # to group all the grays together
    green_letters = set  # to group greens together
    yellow_letters = set  # to group yellows together

    for i in range(5):
        if clues[i] == 'grey':
            guessed_grays.append(guess[i])
        elif clues[i] == 'green':
            green_letters.append(guess[i])
        else:
            yellow_letters.append(guess[i])

    guessed_grays -= yellow_letters  # take out any gray from yellow
    guessed_grays -= green_letters  # take out any gray from green

    return clues



def yes_letters(clues):
    correct_letters = set

    for i in range(5):
        if clues[i] in ['yellow', 'green']:
            correct_letters.append(guess[i])
    return clues


if __name__ == "__main__":
    secrets = get_random_word().upper()
    clues = []

    for i in range (6):
        print ('Known:', known_word(clues))
        print('green/yellow letters:', yes_letters(clues))
        print('grey letters:', no_letters(clues))
        guess = get_guess().upper()
        clue = check_word(secret, guess)
        clues.append(guess, clue)
        for guess, clue in clues:
            print_guess(guess, clue)
        if  guess == secrets:
            print("CORRECT! IT IS:", secret)

