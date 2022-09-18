string[] array = new string[6] {"pie", "may", "granite", "012", "crystal", "crystal"};

void ArrayThreeSymbols(string[] arr)
{
    string[] arr2 = new string[arr.Length];
    int count = 0;
    for (int i = 0; i < arr.Length; i++)
    {
        if(arr[i].Length <= 3)
        {
            arr2[count] = arr[i];
            count++;
        }
    }
    for (int i = 0; i < arr2.Length; i++)
    {
        Console.Write($"{arr2[i]} ");
    }
}

ArrayThreeSymbols(array);