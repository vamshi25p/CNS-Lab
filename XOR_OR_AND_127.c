#include <stdio.h>

int main() {
    // Define the string
    char str[] = "Hello world";
    
    // Define the bitwise operation mask
    unsigned char mask = 127;
    
    // Display the original string
    printf("Original string: %s\n", str);
    
    // Process each character in the string with AND operation
    printf("After AND with 127:\n");
    for (int i = 0; str[i] != '\0'; i++) {
        char and_result = str[i] & mask;
        printf("Original: %c, AND with 127: %c (Hex: %02X)\n", str[i], and_result, and_result);
    }
    
    // Process each character in the string with XOR operation
    printf("\nAfter XOR with 127:\n");
    for (int i = 0; str[i] != '\0'; i++) {
        char xor_result = str[i] ^ mask;
        printf("Original: %c, XOR with 127: %c (Hex: %02X)\n", str[i], xor_result, xor_result);
    }
    
    return 0;
}

