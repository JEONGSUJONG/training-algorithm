T = int(input())

for test_case in range(1,T+1):
    L, U, X = map(int, input().split())
    result = 0

    if X < L:
        result = L - X
    elif L <= X & X <= U:
        result = 0
    else:
        result = -1

    print ("#{} {}" .format(test_case, result))