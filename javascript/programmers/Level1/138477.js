class MinHeap {
  constructor() {
    this.heap = [];
  }

  insert(value) {
    this.heap.push(value);
    this.heapifyUp();
  }

  heapifyUp() {
    let index = this.heap.length - 1;
    while (index > 0) {
      let parentIndex = Math.floor((index - 1) / 2);
      if (this.heap[parentIndex] <= this.heap[index]) break;
      [this.heap[parentIndex], this.heap[index]] = [
        this.heap[index],
        this.heap[parentIndex],
      ];
      index = parentIndex;
    }
  }

  remove() {
    if (this.heap.length === 1) return this.heap.pop();
    const min = this.heap[0];
    this.heap[0] = this.heap.pop();
    this.heapifyDown();
    return min;
  }

  heapifyDown() {
    let index = 0;
    while (2 * index + 1 < this.heap.length) {
      let smallerChildIndex = 2 * index + 1;
      let rightChildIndex = 2 * index + 2;
      if (
        rightChildIndex < this.heap.length &&
        this.heap[rightChildIndex] < this.heap[smallerChildIndex]
      ) {
        smallerChildIndex = rightChildIndex;
      }
      if (this.heap[index] <= this.heap[smallerChildIndex]) break;
      [this.heap[index], this.heap[smallerChildIndex]] = [
        this.heap[smallerChildIndex],
        this.heap[index],
      ];
      index = smallerChildIndex;
    }
  }

  peek() {
    return this.heap[0];
  }

  size() {
    return this.heap.length;
  }
}

function solution(k, score) {
  const minHeap = new MinHeap();
  const result = [];

  for (let i = 0; i < score.length; i++) {
    if (minHeap.size() < k) {
      minHeap.insert(score[i]);
    } else if (score[i] > minHeap.peek()) {
      minHeap.remove();
      minHeap.insert(score[i]);
    }
    result.push(minHeap.peek());
  }
  return result;
}

console.log(solution(3, [10, 100, 20, 150, 1, 100, 200]));
