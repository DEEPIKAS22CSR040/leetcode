/**
 * Note: The returned array must be malloced, assume caller calls free().
 */
int* createTargetArray(int* nums, int numsSize, int* index, int indexSize, int* returnSize) {
    *returnSize=numsSize;
    int *target=(int*)malloc(sizeof(int)*numsSize);
    for (int i = 0; i < numsSize; i++) {
        // Shift elements to the right to make space for insertion
        for (int j = i; j > index[i]; j--) {
            target[j] = target[j - 1];
        }
        target[index[i]] = nums[i]; // Insert nums[i] at index[i]
    }
    return target;
    
    
}