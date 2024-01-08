import random


def get_list_of_random_numbers(size: int, min_limit: int = -100, max_limit: int = 100) -> list:
    return [random.randint(min_limit, max_limit) for _ in range(size + 1)]