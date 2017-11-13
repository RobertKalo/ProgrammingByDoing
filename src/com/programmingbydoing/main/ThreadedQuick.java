package com.programmingbydoing.main;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadedQuick implements Runnable {

	public static final int MAX_THREADS = Runtime.getRuntime().availableProcessors();
	static final ExecutorService executor = Executors.newFixedThreadPool(MAX_THREADS);
	public static int counter = 0;

	final int[] array;
	final int start, end;

	public ThreadedQuick(int[] array, int start, int end) {
		this.array = array;
		this.start = start;
		this.end = end;
		System.out.println("Thread no. " + counter++);
	}

	public void run() {
		quickSort(start, end);
	}

	public void quickSort(final int low, final int high) {

		System.out.println("Running quicksort. MaxThreads: " + MAX_THREADS);
		int i = low;
		int j = high;
		int pivot = array[low + (high - low) / 2];

		while (i <= j) {
			while (array[i] < pivot) {
				i++;
			}
			while (array[j] > pivot) {
				j--;
			}

			if (i <= j) {
				int temp = array[i];
				array[i] = array[j];
				array[j] = temp;
				i++;
				j--;
			}
		}

		if (i < high) {
			new ThreadedQuick(array, i, high).quickSort(i, high);
		}
		if (j > low) {
			new ThreadedQuick(array, low, j).quickSort(low, j);
		}
	}

}