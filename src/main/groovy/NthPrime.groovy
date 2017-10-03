class NthPrime {

    static def nth(n){
        if(n == 0){
            throw new ArithmeticException()
        }

        List<Integer> primes = new ArrayList<>();
        primes.add(1)
        primes.add(2)
        primes.add(3)
        int i = 4
        while(primes.size() <= n){
            boolean isPrime = true
            for(int prime : primes){
                if(prime == 1){
                    continue
                }
                if(i % prime == 0){
                    isPrime = false
                }
            }
            if(isPrime) {
                primes.add(i)
            }
            i++
        }
        primes.get(n)
    }
}
