import spock.lang.Specification

import static Solution.main

/**
 * Created by szewczm1 on 9/16/2015.
 */
class SolutionTest extends Specification {
    def static t0 = '''
0
'''

    def static t1 = '''
1
1
'''
    def static t2 = '''
2
1 2
3 4
'''
    def static t3 = '''
3
1 2 3
4 5 6
7 8 9
'''

    def static t4 = '''
4
1 2 3 4
5 6 7 8
9 10 11 12
13 14 15 16
'''

    def static t5 = '''
5
1 2 3 4 5
6 7 8 9 10
11 12 13 14 15
16 17 18 19 20
21 22 23 24 25
'''

    def static t6 = '''
6
1 2 3 4 5 6
7 8 9 10 11 12
13 14 15 16 17 18
19 20 21 22 23 24
25 26 27 28 29 30
31 32 33 34 35 36
'''

    def 'should be valid test'() {
        given:
        def mockIn = new ByteArrayInputStream(tab.getBytes());
        System.setIn(mockIn);

        expect:
        main();

        where:
        tab << [
                t0, t1, t2, t3, t4, t5, t6
        ]
    }
}
