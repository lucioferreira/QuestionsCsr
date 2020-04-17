# -*- coding: utf-8 -*-

def charCounter( text ):
    resp = 0
    for c in text:
        if c != " ":
            resp = resp + 1
    return resp

if __name__ == '__main__':

    text = "User is not allowed      ";
    
    counter = charCounter(text)
    numSpaces = len(text.split()) - 1
    indexLastChar = counter + numSpaces

    print("input: {0:s}, {1:d}".format(text, indexLastChar))
    
    numChars = counter + numSpaces 
    leftSpaces = len(text) - numChars      
    sumSpaces = numSpaces + leftSpaces

    if( leftSpaces == (numSpaces * 2) ):
        print("output: {0:s}".format(text[:indexLastChar].replace(" ", "%32")))
