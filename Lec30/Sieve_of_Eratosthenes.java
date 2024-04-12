package Lec30;

public class Sieve_of_Eratosthenes {
        public static void main(String[] args) {
            int n = 100;
            PrintPrime(n);

        }

        // false  --> prime number
         // true  --> not prime number
        public static void PrintPrime(int n) {
            boolean[] prime = new boolean[n + 1];
            prime[0] = true;
            prime[1] = true;
            for (int i = 2; i * i <= prime.length; i++) {
                if (prime[i] == false) {
                    for (int j = 2; i * j < prime.length; j++) {
                        prime[i * j] = true;
                    }
                }
            }
            for (int i = 2; i < prime.length; i++) {
                if (prime[i] == false) {
                    System.out.println(i);
                }
            }
        }
    }
