s1 = '05:01:00PM'
s2 = '12:01:00AM'


def time_conversion(s: str) -> str:
    time_str = s.split(':')
    hour = int(time_str[0])
    am_pm = time_str[2][2:]

    if am_pm == 'PM':
        if hour != 12:
            hour = hour + 12
    else:
        if hour == 12:
            hour = 0

    return f'{str(hour).zfill(2)}:{time_str[1]}:{time_str[2][:2]}'


print(time_conversion(s1))
