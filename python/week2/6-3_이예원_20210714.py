#https://leetcode.com/problems/implement-queue-using-stacks/

import queue

class MyStack:
    def __init__(self):
        self.q = queue.Queue()

    def push(self, x: int) -> None:
        self.q.put(x)

    def pop(self) -> int:
        for _ in range(self.q.qsize() - 1):
            self.q.put(self.q.get())
        return self.q.get()

    def top(self) -> int:
        for _ in range(self.q.qsize() - 1):
            self.q.put(self.q.get())
        peek = self.q.get()
        self.q.put(peek)
        return peek

    def empty(self) -> bool:
        return self.q.qsize() == 0
