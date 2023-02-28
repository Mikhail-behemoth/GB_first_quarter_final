def show_menu() -> int:
    print("\nВыберите необходимое действие:\n"
          "1. Отобразить все заметки\n"
          "2. Найти заметку по дате\n"
          "3. Найти заметку по номеру\n"
          "4. Добавить новую заметку\n"
          "5. Сохранить заметки в текстовом формате\n"
          "6. Закончить работу")
    choice = int(input())
    return choice

def print_result(data: list):
    for el in data:
        s = ''
        for v, k in el.items():
            s += f'{v}: {k}\n'
        print(s)


def get_search_date() -> str:
    return input("Введите дату для поиска: ")


def get_search_number() -> str:
    return input("Введите номер заметки для поиска: ")


def get_new_user() -> str:
    last_name = input("Введите дату: ")
    first_name = input("Введите Заголовок: ")
    phone_number = input("Введите номер заметки: ")
    description = input("Введите текст заметки: ")
    return f'{last_name},{first_name},{phone_number},{description}'

def get_file_name() -> str:
    return input("Введите название файла для сохранения: ")
