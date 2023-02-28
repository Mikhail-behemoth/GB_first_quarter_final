from view import (show_menu, print_result, get_search_date,
                  get_search_number, get_new_user, get_file_name)
from model import write_txt, write_csv, read_txt, read_csv, find_by_name, find_by_number, add_user

def work_with_notes():
    choice = show_menu()
    note = read_csv('notes.csv')
    while (choice != 6):
        if choice == 1:
            print_result(note)
        elif choice == 2:
            name = get_search_date()
            print(find_by_name(note, name))
        elif choice == 3:
            number = get_search_number()
            print(find_by_number(note, number))
        elif choice == 4:
            user_data = get_new_user()
            add_user(note, user_data)
            write_csv('notes.csv', note)
        elif choice == 5:
            file_name = get_file_name()
            write_txt(file_name, note)
        choice = show_menu()
