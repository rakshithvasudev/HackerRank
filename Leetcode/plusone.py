def plusOne(self, digits):
    """
    :type digits: List[int]
    :rtype: List[int]
    """
    digits = map(str, digits)
    digits = "".join(digits)
    actual = int(digits)
    result = actual + 1
    result = str(result)
    final = [int(char) for char in result ]
    return final