def raise_power(number):
    def power(actual_power):
       return number ** actual_power
    return power

two_case = raise_power(2)
print(two_case(5))


three_case = raise_power(3)
print(three_case(5))

