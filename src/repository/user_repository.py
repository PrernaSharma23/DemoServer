mock_users = {
    1: {"id": 1, "name": "Alice", "email": "alice@example.com"},
    2: {"id": 2, "name": "Bob", "email": "bob@example.com"},
    3: {"id": 3, "name": "Charlie", "email": "charlie@example.com"},
}

def find_by_id(user_id: int):
    return mock_users.get(user_id)

def find_all():
    return list(mock_users.values())
