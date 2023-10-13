class Solution {
	public int solution(int a, int b, int c, int d) {
		int answer = 0;
		if (a == b && b == c && c == d) {
			return 1111 * a;
		} else if ((a == b && b == c) || (a == b && b == d) || (a == c && c == d) || (b == c && c == d)) {
			if (a == b && b == c) {
				return (10 * a + d) * (10 * a + d);
			} else if (a == b && b == d) {
				return (10 * a + c) * (10 * a + c);
			} else if (a == c && c == d) {
				return (10 * a + b) * (10 * a + b);
			} else {
				return (10 * b + a) * (10 * b + a);
			}
		} else if ((a == b && c == d && a != c) || (a == c && b == d && a != b && c != d) || (a == d && b == c && a != b && d != c)) {
			if (a == b && c == d && a != c) {
				answer = (a + c) * (a - c);
			} else if (a == c && b == d && a != b && c != d) {
				answer = (a + b) * (a - b);
			} else if (a == d && b == c && a != b && d != c) {
				answer = (a + b) * (a - b);
			}
		} else if ((a == b && c != a && d != a) || (a == c && b != a && d != a) || (a == d && b != a && c != a)
				|| (b == c && a != b && d != b) || (b == d && a != b && c != b) || (c == d && a != c && b != c)) {
			if (a == b) {
				return c * d;
			} else if (a == c) {
				return b * d;
			} else if (a == d) {
				return b * c;
			} else if (b == c) {
				return a * d;
			} else if (c == d) {
				return a * b;
			} else {
				return a * c;
			}
		} else {
			int min = Math.min(Math.min(a, b), Math.min(c, d));
			return min;
		}
		return answer = (answer > 0) ? answer : answer * -1;
	}
}
