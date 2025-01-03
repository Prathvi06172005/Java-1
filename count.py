import string
Sentence=input("enter the sentence")
wordlist=Sentence.strip().split(" ")
print(f'this sentence {len(wordlist)} words',end='\n\n')
digit_Count=uppercase_Count=lowercase_Count=0
for character in Sentence:
    if character in string.digits:
        digit_Count+=1
    elif character in string.ascii_uppercase:
        uppercase_Count+=1
    elif character in string.ascii_lowercase:
        lowercase_Count+=1
print(f'this sentence has{digit_Count} digits',f'{uppercase_Count} uppercase letter',f'{lowercase_Count} lowercase letter',sep='\n')